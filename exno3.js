function greetUser(){
    const username=document.getElementById('userName').value;
    const greeting=document.getElementById('greeting');
    if(username.trim()===""){
        alert("please enter your name!");
        greeting.textContent="";
    }else {
        greeting.textContent=`Hello, ${username}!`;
    }
}
