'use-strict';

const express = require('express');
const loki = require('lokijs');
const bodyParser = require('body-parser');
const uuidv1 = require('uuid/v1');

const db = new loki('loki.json');
const puppies = db.addCollection('puppies');
const app = express();

const initData = [
    {
        name: 'Pupperito',
        breed: 'Cotton Terrier',
        age: 0.4,
        uuid: uuidv1()
    },
    {
        name: 'Tibby',
        breed: 'Corgo',
        age: 3,
        uuid: uuidv1()
    }
    ,
    {
        name: 'Balou',
        breed: 'Golden Brinback',
        age: 10,
        uuid: uuidv1()
    }
];

puppies.insert(initData);

app.use(bodyParser.json());
app.get('/', (req, res) => {
    res.send("Thanks");
});

app.post('/pup', (req, res) => {
    console.log(JSON.stringify(req.body));
    var pup = req.body;
    
    var existingPupperito = puppies.find({name: pup.name});
    if(existingPupperito.length > 0){
        res.status(409);
        
        res.send(JSON.stringify({error: 'A pupperito with this name already exists, please give him a new one'}));
        
    } else {
        
        pup.uuid = uuidv1();
        console.log(JSON.stringify(pup));
        puppies.insert(pup);
        res.send(JSON.stringify(pup));
    }   
});

app.put('/pup/:uuid', (req, res) => {
    const uuid = req.params.uuid;
    var pupper = puppies.find({'uuid': uuid});
    var updatePupper = req.body;
    if(pupper){
        pupper.name = updatePupper.Name;
        pupper.breed = updatePupper.Breed;
        pupper.age = updatePupper.Age;
        puppies.update(pupper);
    }

});
app.get('/pup', (req, res) => {
    const puppers = puppies.chain().simplesort("name").data();

    res.send(puppers);
});

app.get('/pup/:uuid', (req, res) => {
    const pupper = puppies.find({uuid: req.params.uuid});
    if(pupper.length > 0){
        res.send(JSON.stringify(pupper[0]));
    } else {
        res.status(404);
        res.send(JSON.stringify({error: 'pupper not found'}));
    }
});

app.listen(3005);