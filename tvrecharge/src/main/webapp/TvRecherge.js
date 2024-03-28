let getFields={
"customerId":false,
"Vender":false,
"RechargeType":false,
"Amount":false;
"accepted":false;
}
function validate(){
let flag=false;
for(let [key,value] of Object.entries(getFields)){
if(value===false){
falg=true;
break;
}
}
if(!flag){
document.getElementById("button").removeAttribute("disabled");
}
else
{
document.getElementById("button").removeAttribute("disabled", " ");
}

}
function custIdvalidate(){
let custid=document.getElementById("customerId")
let error=document.getElementById("errorcustid")
if(custid.value.trim()===" "){
error.innerHTML="please enter valid customerId"
error.style.color='red';
getFields["customerId"]=false;

}
 } else if (custid.value.trim().length!=8) {
        error.innerHTML = "customer id should be 8 characters";
        error.style.color = 'red';
        getFields["venue"] = false;
    } else {
        getFields["cuatomerId"] = true;
        error.innerHTML = "";
    }
    validate();
}