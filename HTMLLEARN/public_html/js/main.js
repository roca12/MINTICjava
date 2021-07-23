/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var myVar;

function initLoader() {
    myVar = setTimeout(showPage, 3000);
}

function showPage() {
    document.getElementById("overlay").style.display = "none";
    document.getElementById("divcontainer").style.display = "block";
}