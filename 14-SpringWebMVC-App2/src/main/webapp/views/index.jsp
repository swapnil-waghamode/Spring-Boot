<html>
<head>
   
</head>

<body>

   <h1> Form Data </h1>


   <form action="book">
   
      Book Id : <input type="text" name="id"/><br>
      <input type="submit" value="search"/>
   </form>
   
   <hr/>
   
   BookId : ${book.bookId} <br>
   BookName : ${book.bookName} <br>
   BookPrice : ${book.bookPrice} <br>


</body>

</html>