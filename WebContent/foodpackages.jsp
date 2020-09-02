
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bstrap\scripts\bootstrap3\css\bootstrap.min.css">
   <link href="global.css" type="text/css" rel="stylesheet">
  <script src="bstrap\scripts\jquery.js"></script>
  <script src="bstrap\scripts\bootstrap3\js\bootstrap.min.js"></script>
</head>
<body>


<div class="container-fluid bg">
<h1>FOOD PACKAGE DETAILS</h1>
<h3><a href="homepage.jsp">HOME</a></h3>
  <form class="form-container" method="post" action="HandleFoodPackages.jsp">
  <div class="row">
<div class="col-25">
      <label for="foodpackagename">Food Package Name:</label>
   </div>
  <div class="col-75"> 
       <input type="text"  id="foodpackagename" placeholder="Enter package name" name="foodpackagename">
  </div>
</div>
  <div class="row">
    <div class="col-25">
<label for="noofwelcomedrinks">No Of Welcome Drinks:</label>
    </div>
    <div class="col-75">
      <input type="number"  id="noofwelcomedrinks" placeholder="Enter no of drinks" name="noofwelcomedrinks">
    </div>
  </div>

<div class="row">
    <div class="col-25">
<label for="soups">No Of Soups:</label>
    </div>
    <div class="col-75">
      <input type="number"  id="soups" placeholder="Enter no of soups" name="soups">
    </div>
  </div>
 
 <div class="row">
    <div class="col-25">
 <label for="salads">No Of Salads:</label>
    </div>
    <div class="col-75">
      <input type="number" id="salads" placeholder="Enter no of salads" name="salads">
    </div>
  </div>

<div class="row">
    <div class="col-25">
 
     <label for="starters">No Of Starters:</label>
    </div>
    <div class="col-75">
     <input type="number" id="starters" placeholder="Enter no of starters" name="starters">
    </div>
  </div>

<div class="row">
    <div class="col-25">
<label for="noofpaneerveg">No Of Paneer Veg:</label>
    </div>
    <div class="col-75">
     <input type="number" id="noofpaneerveg" placeholder="Enter no of paneerveg" name="noofpaneerveg">
    </div>
  </div>

<div class="row">
    <div class="col-25">
<label for="noofotherveg">No Of Other Veg:</label>
    </div>
    <div class="col-75">
      <input type="number"  id="noofotherveg" placeholder="Enter no of other veg" name="noofotherveg">
    </div>
  </div>

<div class="row">
    <div class="col-25">
<label for="rice">No Of Rice:</label>
    </div>
    <div class="col-75">
     <input type="number" id="rice" placeholder="Enter no of rice" name="rice">
    </div>
  </div>

<div class="row">
    <div class="col-25">
<label for="dal">No Of Dal:</label>
    </div>
    <div class="col-75">
      <input type="number" id="dal" placeholder="Enter no of dal" name="dal">
    </div>
  </div>

<div class="row">
    <div class="col-25">
<label for="roti">No Of Roti:</label>
    </div>
    <div class="col-75">
      <input type="number" id="roti" placeholder="Enter no of roti" name="roti">
    </div>
  </div>

<div class="row">
    <div class="col-25">
<label for="miscellaneous">No Of Miscellaneous:</label>
    </div>
    <div class="col-75">
     <input type="number"  id="miscellaneous" placeholder="Enter no of miscellaneous" name="miscellaneous">
    </div>
  </div>

<div class="row">
    <div class="col-25">
<label for="rate">Rate:</label>
     </div>
    <div class="col-75">
      <input type="number" id="rate" placeholder="Enter rate" name="rate">
    </div>
  </div>

  
  <div class="row">
    <button type="submit" class="btn btn-info">Add Package</button>
  </div>

  </form>
</div>

</body>
</html>
