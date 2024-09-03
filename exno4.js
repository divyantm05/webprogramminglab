let numbers=[];
const numberInput=document.getElementById("numberInput");
const numberList=document.getElementById("numberList");
const sumElement=document.getElementById("sum");

function addNumber(){
  const number=parseFloat(numberInput.value);
  if (isNaN(number)) {
    alert("please enter a valid number!");
    numberInput.value="";
    return;
  }

  numbers.push(number);
  numberInput.value="";

  numberList.textContent=`Entered numbers: ${numbers.join(", ")}`;

  const sum=numbers.reduce((total,num)=>total+num,0);
  sumElement.textContent=`sum: ${sum}`;
}
