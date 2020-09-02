<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bstrap\scripts\bootstrap3\css\bootstrap.min.css">
   <link href="global2.css" type="text/css" rel="stylesheet">
  <script src="bstrap\scripts\jquery.js"></script>
  <script src="bstrap\scripts\bootstrap3\js\bootstrap.min.js"></script>
</head>
<body>

<div class="container-fluid bg">
<h1>EVENT CATEGORY DETAILS</h1>
<h3><a href="homepage.jsp">HOME</a></h3>
  <form class="form-container" method="post" action="HandleEventCategory.jsp">
  <div class="row">
<div class="col-25">
      <label for="eventcatname">Event Category Name:</label>
   </div>
  <div class="col-75"> 
       <input type="text"  id="eventcatname" placeholder="Enter event name" name="eventcatname">
  </div>
</div>
  <div class="row">
    <div class="col-25">
<label for="logo">Logo:</label>
    </div>
    <div class="col-75">
      <input type="text"  id="logo" placeholder="Enter logo" name="logo">
    </div>
  </div>
  
  <div class="row">
    <button type="submit" class="btn btn-info">Add Event</button>
  </div>

  </form>
</div>

</body>
</html>