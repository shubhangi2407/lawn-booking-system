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
<h1>FOOD CATEGORY DETAILS</h1>
<h3><a href="homepage.jsp">HOME</a></h3>
  <form class="form-container" method="post" action="HandleFoodCat.jsp">
  <div class="row">
<div class="col-25">
      <label for="foodcategoryname">Food Category Name:</label>
   </div>
  <div class="col-75"> 
       <input type="text"  id="foodcategoryname" placeholder="Enter category name" name="foodcategoryname">
  </div>
</div>
  

  
  <div class="row">
    <button type="submit" class="btn btn-info">Add Category</button>
  </div>

  </form>
</div>

</body>
</html>