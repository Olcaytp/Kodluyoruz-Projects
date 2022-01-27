let submitButton = document.getElementById("submitButton");
let resetButton = document.getElementById("resetButton");
let myTable = document.getElementsByClassName("myTable");
let ul = document.createElement("ul");
ul.setAttribute("id", "theList");
myTable.appendChild(ul);


function submitFunction() {
  let inputVal = document.getElementById("nameArea").value;
  let inputVal1 = document.getElementById("telArea").value;
  let inputVal2 = document.getElementById("adressArea").value;
  alert(inputVal);
  alert(inputVal1);
  alert(inputVal2);


}