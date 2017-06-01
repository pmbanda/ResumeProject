<%-- 
    Document   : miscellaneous
    Created on : Apr 4, 2017, 6:16:57 PM
    Author     : Royalty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <title>Database::Resume</title>
    <meta charset="utf-8" />
    <meta name="keywords" content="Resume show case, peter eugene mbanda, resume example"/>
    <meta name="description" content="class projects Javascript, HTML, CSS, Java, Jsoup"/>
    <link rel="stylesheet" type="text/css" href="css\stylesch4.css" />
    
    
<script src="https://www.gstatic.com/firebasejs/4.0.0/firebase.js"></script>
<script>
  // Initialize Firebase
  var config = {
    apiKey: "AIzaSyCtBR0CoLN5TAZhbbSmslHkOnqbMKvSpjg",
    authDomain: "webinvestors-294d6.firebaseapp.com",
    databaseURL: "https://webinvestors-294d6.firebaseio.com",
    projectId: "webinvestors-294d6",
    storageBucket: "webinvestors-294d6.appspot.com",
    messagingSenderId: "741301404754"
  };
  firebase.initializeApp(config);
  
  const preObject = document.getElementById('object');
  
  const dbRef = firebase.database().ref().child('object');
  
  dbRef.on('value', snap => console.log(snap.val()));
  
</script>
</head>
<body>
    <header>
        <div style="text-align: center">
            <a style="background-color: #f9f5f3" href="resume.jsp"><img src="images\resumeimages.jpg" height="150" width="200" alt="resume logo" style="box-shadow: 10px 10px 15px #888888" /></a>
        </div>
    </header>
    
    
    <br />
    <table class="menu" style="border-style: none">
        <tr>
            <th class="menuicon"><a href="resume.jsp">Home</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="webexamples.jsp">Web Sites</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="webscraper.jsp">Web Scraper</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="#">Database</a></th>
            <td class="menupipe">|</td>
            <th class="menuicon"><a href="contact.jsp">Contact</a></th>
        </tr>
    </table>
    
<div id="body">  
    <h3 id="body">Database application page</h3>  
    <p>
        Display database objects.
    <pre id="object">
        
    </pre>
    </p>
    
    
</div> 
    <footer id="body" style="text-align: center">
        <small>Copyright &#169; 2017 Mansory Inc. All rights reserved</small>
    </footer>
</body>
</html>
