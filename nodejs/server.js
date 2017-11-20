'use-strict';

const express = require('express');
const loki = require('lokijs');
const bodyParser = require('body-parser');
const uuidv1 = require('uuid/v1');
const db = new loki('./loki.json');
const app = express();
const puppies = db.addCollection('puppies');        

app.use(bodyParser.json());


const initData = [
    {
        name: 'Pupperito',
        breed: 'Cotton_Terrier',
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
        breed: 'Golden_Bringback',
        age: 10,
        uuid: uuidv1()
    }
];

puppies.insert(initData);

app.get('/pup', (req, res) => {
    console.log(db);
    if(puppies){
        const puppers = puppies.chain().simplesort("name").data();
        res.send(puppers);
    } else {
        res.status(404);
        res.send(JSON.stringify({error: '404, puppers not found'}));
    }
    
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

app.put('/pup/:uuid', (req, res)=>{
    const uuid = req.params.uuid;
    var pupper = puppies.find({'uuid': uuid});
    var updatePupper = req.body;
    if(pupper){
        pupper.name = updatePupper.Name;
        pupper.breed = updatePupper.Breed;
        pupper.age = updatePupper.Age;
        puppies.update(pupper);
        res.status(200);
        res.send(JSON.stringify({success: 'true'}));
    } else {
        res.status(500);
        res.send(JSON.stringify({error: 'woof'}));
    }
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

app.listen(3000);