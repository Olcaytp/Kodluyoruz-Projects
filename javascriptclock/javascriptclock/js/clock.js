function showTime() {
	let clockEl = document.getElementById('myClock') 

   	setInterval(() => {
   		let dateObj = new Date()
   		
   		let time = dateObj.toLocaleTimeString('tr-TR')
   		
   		let options = { weekday: 'long' }
   		let date = dateObj.toLocaleDateString('tr-TR', options)

   		clockEl.innerHTML = `${time} ${date}`
   }, 999)
}

(function() {
	let name = ''
	do {
   		name = prompt('Adınızı girin!')
	} while (name == '')

   nameEl = document.getElementById('myName')
   nameEl.innerHTML = name
   
   let clockEl = document.getElementById('myClock') 
   
   clockEl.addEventListener('onload', clockEl.onload())

})();
/*
<!---beterbocekler2.tr.gg kod başlangıc---> <script language="JavaScript"> 
<!-- 
var now = new Date(); var yr = now.getYear(); var mName = now.getMonth() + 1; var dName = now.getDay() + 1; 
var yr_str = " 19"; // yil 2000 iken, 19 sayisinin ï¿½ikmamasini saglayacak string 
var dayNr = ((now.getDate()<10) ? "" : "")+ now.getDate(); if(dName==1) Day = "Pazar"; if(dName==2) Day = "Pazartesi"; if(dName==3) Day = "Salı"; if(dName==4) Day = "ï¿½arşamba"; if(dName==5) Day = "Perşembe"; if(dName==6) Day = "Cuma"; if(dName==7) Day = "Cumartesi"; if(mName==1) Month="Ocak"; if(mName==2) Month="Şubat"; if(mName==3) Month="Mart"; 
if(mName==4) Month="Nisan"; if(mName==5) Month="Mayıs"; if(mName==6) Month="Haziran"; if(mName==7) Month="Temmuz"; if(mName==8) Month="Ağustos"; if(mName==9) Month="Eylï¿½l"; 
if(mName==10) Month="Ekim"; if(mName==11) Month="Kasım"; if(mName==12) Month="Aralık"; 
if ( yr > 99 ) 
{ 
yr_str =" "; 
if ( yr < 2000 ) yr += 1900; 
}var todaysDate =(" " + dayNr + " " + Month + yr_str + yr + "" + ", " + Day + ""); document.open(); document.write("<FONT face=arial SIZE=4 color=black>"+todaysDate+"</FONT>");// --> 
</script>  <!---beterbocekler2.tr.gg kod bitişi--->*/