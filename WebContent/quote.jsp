<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Your random quote today. Enjoy! :)</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="Random Quote">
  <meta name="keywords" content="random quote random quotes">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  <link href='http://fonts.googleapis.com/css?family=Patrick+Hand' rel='stylesheet' type='text/css'>
</head>
<body>
  
<div class="container" style="font-family: 'Patrick Hand', cursive;margin-top: 3em;">
	<blockquote>
	  <p style="font-size: 1.5em;">${quote.wording}</p>
	  <footer style="font-size: 1.1em;margin-left: 2em;">${quote.author}</footer>
	</blockquote>
	<p style="font-size: 1.3em;margin-top:4em;">Hope you enjoyed your random quote! Don't forget to live a long and happy Life! :)</p>
	<p style="font-size: 1.3em">More random quotes coming soon.</p>
</div>

<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
  ga('create', 'UA-62824002-1', 'auto');
  ga('send', 'pageview');
</script>
</body>
</html>
