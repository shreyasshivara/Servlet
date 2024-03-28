
let getFields={
"team1":false,
"team2":false,
"venue":false,
"date":false,
"time":false,
"toss":false,
"decision":false,
"innings1":false,
"innings2":false,
"man":false,
"top":false,
"bowler":false,
"tv":false,
"weather":false,
"six":false
}

function validate(){

let flag=false;

for(let[key,value] of Object.entries(getFields)){
if(value===false){

flag=true;
break;
}
}
if(!flag){
document.getElementById("btn").removeAttribute("disabled");
}else{
document.getElementById("btn").setAttribute("disabled","");
}
}


function setTeam1(){
let city=document.getElementById("team1");
let error=document.getElementById("team1Error");

if(city.value!="0"){
error.innerHTML="";
getFields["team1"]=true;
}
else{
error.innerHTML="Please select team1";
error.style.color='red';
getFields["team1"]=false;
}
validate();
}



function setTeam2(){
let city=document.getElementById("team2");
let error=document.getElementById("team2Error");

if(city.value!="0"){
error.innerHTML="";
getFields["team2"]=true;
}
else{
error.innerHTML="Please select team2";
error.style.color='red';
getFields["team2"]=false;
}
validate();
}

function setVenue() {
    let cname = document.getElementById("venue");
    let error = document.getElementById("venueError");

    if (cname.value.trim() === "") {
        error.innerHTML = "Please enter a valid venue";
        error.style.color = 'red';
        getFields["venue"] = false;
    } else if (cname.value.trim().length < 5 || cname.value.trim().length > 20) {
        error.innerHTML = "venue must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["venue"] = false;
    } else {
        getFields["venue"] = true;
        error.innerHTML = "";
    }
    validate();
}

function setDate() {
    let cname = document.getElementById("date");
    let error = document.getElementById("dateError");

    if (cname.value.trim() === "") {
        error.innerHTML = "Please select date";
        error.style.color = 'red';
        getFields["date"] = false;
    }
     else {
        getFields["date"] = true;
        error.innerHTML = "";
    }
    validate();
}


function setTime() {
    let cname = document.getElementById("time");
    let error = document.getElementById("timeError");

    if (cname.value.trim() === "") {
        error.innerHTML = "Please select time";
        error.style.color = 'red';
        getFields["time"] = false;

    } else {
        getFields["time"] = true;
        error.innerHTML = "";
    }
    validate();
}

function setToss() {
    let cname = document.getElementById("toss");
    let error = document.getElementById("tossError");

    if (cname.value.trim() === "") {
        error.innerHTML = "Please enter a valid Toss Winner";
        error.style.color = 'red';
        getFields["toss"] = false;
    } else if (cname.value.trim().length < 1 || cname.value.trim().length > 20) {
        error.innerHTML = " ";
        error.style.color = 'red';
        getFields["toss"] = false;
    } else {
        getFields["toss"] = true;
        error.innerHTML = "";
    }
    validate();
}

function setDecision() {
    let cname = document.getElementById("decision");
    let error = document.getElementById("decisionError");

    if (cname.value.trim() === "") {
        error.innerHTML = "Please enter a valid Toss Decision";
        error.style.color = 'red';
        getFields["decision"] = false;
    } else if (cname.value.trim().length < 5 || cname.value.trim().length > 20) {
        error.innerHTML = "venue must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["decision"] = false;
    } else {
        getFields["decision"] = true;
        error.innerHTML = "";
    }
    validate();
}

function setInnings1() {
    let innings = document.getElementById("innings1");
    let error = document.getElementById("innings1Error");

    let innings1 = parseInt(innings.value.trim()); // Convert input value to a number

    if (isNaN(innings1) || innings1 < 1 || innings1 > 1000) {
        error.innerHTML = "innings 1 score number must be a valid number between 1 and 1000";
        error.style.color = 'red';
        getFields["innings1"] = false;
    } else if (innings.value.trim() === "") {
        error.innerHTML = "Please enter a valid innings 1 score number";
        error.style.color = 'red';
        getFields["innings1"] = false;
    } else {
        getFields["innings1"] = true;
        error.innerHTML = "";
    }
    validate();
}

function setInnings2() {
    let innings = document.getElementById("innings2");
    let error = document.getElementById("innings2Error");

    let innings2 = parseInt(innings.value.trim()); // Convert input value to a number

    if (isNaN(innings2) || innings2 < 1 || innings2 > 1000) {
        error.innerHTML = "innings 2 score number must be a valid number between 1 and 1000";
        error.style.color = 'red';
        getFields["innings2"] = false;
    } else if (innings.value.trim() === "") {
        error.innerHTML = "Please enter a valid innings 2 score number";
        error.style.color = 'red';
        getFields["innings2"] = false;
    } else {
        getFields["innings2"] = true;
        error.innerHTML = "";
    }
    validate();
}





function setManOfTheMatch() {
    let cname = document.getElementById("man");
    let error = document.getElementById("manError");

    if (cname.value.trim() === "") {
        error.innerHTML = "Please enter a valid Man Of the Match name";
        error.style.color = 'red';
        getFields["man"] = false;
    } else if (cname.value.trim().length < 5 || cname.value.trim().length > 20) {
        error.innerHTML = "Man of the match name must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["man"] = false;
    } else {
        getFields["man"] = true;
        error.innerHTML = "";
    }
    validate();
}


function setTop() {
    let cname = document.getElementById("top");
    let error = document.getElementById("topError");

    if (cname.value.trim() === "") {
        error.innerHTML = "Please enter a valid Top scorer";
        error.style.color = 'red';
        getFields["top"] = false;
    } else if (cname.value.trim().length < 5 || cname.value.trim().length > 20) {
        error.innerHTML = "Top scorer name must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["top"] = false;
    } else {
        getFields["top"] = true;
        error.innerHTML = "";
    }
    validate();
}


function setBowler() {
    let cname = document.getElementById("bowler");
    let error = document.getElementById("bowlerError");

    if (cname.value.trim() === "") {
        error.innerHTML = "Please enter a valid Wicket Taken By Bowler Name";
        error.style.color = 'red';
        getFields["bowler"] = false;
    } else if (cname.value.trim().length < 5 || cname.value.trim().length > 20) {
        error.innerHTML = "Bowler Name must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["bowler"] = false;
    } else {
        getFields["bowler"] = true;
        error.innerHTML = "";
    }
    validate();
}


function setTv() {
    let cname = document.getElementById("tv");
    let error = document.getElementById("tvError");

    if (cname.value.trim() === "") {
        error.innerHTML = "Please enter a valid Tv Broadcosters";
        error.style.color = 'red';
        getFields["tv"] = false;
    } else if (cname.value.trim().length < 5 || cname.value.trim().length > 20) {
        error.innerHTML = "Tv Broadcoster's must be between 5 and 20 characters long";
        error.style.color = 'red';
        getFields["tv"] = false;
    } else {
        getFields["tv"] = true;
        error.innerHTML = "";
    }
    validate();
}



function setWeather(){
let fruit=document.getElementById("weather");
let error=document.getElementById("weatherError");

if(fruit.value!="0"){
error.innerHTML="";
getFields["weather"]=true;
}
else{
error.innerHTML="Please select a Weather";
error.style.color='red';
getFields["weather"]=false;
}
validate();
}


function setSix() {
    let sixes = document.getElementById("six");
    let error = document.getElementById("sixError");

    let sixer = parseInt(sixes.value.trim()); // Convert input value to a number

    if (isNaN(sixer) || sixer < 1 || sixer > 1000) {
        error.innerHTML = "Total sixes  number must be a valid number between 1 and 1000";
        error.style.color = 'red';
        getFields["six"] = false;
    } else if (sixes.value.trim() === "") {
        error.innerHTML = "Please enter a valid Total Sixes in number";
        error.style.color = 'red';
        getFields["six"] = false;
    } else {
        getFields["six"] = true;
        error.innerHTML = "";
    }
    validate();
}