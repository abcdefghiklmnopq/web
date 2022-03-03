/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var getvalue = function getvalue(){
        document.getElementById("searchFrm").submit();
 
}
var clear;
function Stat(){
   setInterval(getvalue,100);
}
function Stop(){
    
    clearInterval(clear);
    document.getElementById("time").value =0;
}


