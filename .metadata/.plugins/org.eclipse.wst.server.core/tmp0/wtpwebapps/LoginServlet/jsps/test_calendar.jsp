
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="static/bootstrap.min.css" rel="stylesheet">
	<title>Hello</title>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
	<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script>
 $(function() {
  $( "#datepicker" ).datepicker();
}); 
</script>
	
</head>
<body>
 
<nav class="navbar navbar-inverse navbar-default navbar-static-top">
    <div class="container">
      <div class="navbar-header">
        <a class = "navbar-brand"> See history state for website </a>
        <button class = "navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
          </button>
      </div>
    </div>
  </nav>

	<div class="container">
	  <div class = "row">  
	    <div class = "col-md-8 col-md-offset-2">
	      <div class = "panel panel-default">
	        <div class = "panel-body">
	          <table class="table table-striped"> 
	          	 <tr>
	                <th></th>
	                <th></th>
	                <th></th>
	                <th></th>
	              </tr>
	              <tr>
		              <div> 
		                <td class = "col-md-1"></div>
		                
		                </td>
		                <form method="post" action="LoginServlet" class = "form-horizontal">
		                <td class = "col-md-2">
			                <label for="view_url" class = "col-lg-2 control-label">Website url&emsp;</label>
			                <input type="text" id="view_url" name="view_url" class="form-control form-control-inline" pattern="[A-Za-z0-9_].{2,20}" maxlength="20" title="3 to 20 characters" required /><br>
			            </td>
		                <td class = "col-md-2">
		                    <p>Date: <input type="text" id="datepicker" name="view_date_time"></p>
		                    
		                </td> 
		                
		                <td>
			                <input type="hidden" name="op" value="view_view">
		               		<input type="submit" value="View" class="btn btn-success pull-right">
		                </td>
		                <td>
		                	
		                </td>
			            </form>
		                
		              </div>
		            </tr>
		            <tr>
		            </tr>
	          
	          
	          
	          	
	          </table>
	        </div>
	      </div>
	    </div>
	  </div>
	</div>
	
		
	<div class = "navbar navbar-default navbar-fixed-bottom">
	  <div class = "container">
	    <p class = "navbar-text pull-left"> Site Built by Jessica 
	    </p>
	    <a href = "http://www-personal.umich.edu/~chenxicx/index.html" class = "navbar-btn btn-default btn pull-right"> Visit my website </a>
	  </div>
	</div>
		
		
	<script src="static/angular.min.js"></script>
	<script src="static/angular.js"></script> 
	<script src="static/bootstrap.min.js"></script>
	<script src="static/bootstrap.js"></script>
</body>
</html>