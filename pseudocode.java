// CLASS Book:
//     Properties:
//         String title
//         String author
//         boolean isBorrowed

// CLASS Library:
//     Properties:
//         ArrayList<Book> booksList
//         HashMap<String, Book> booksMap
//         Stack<Book> borrowHistory
//         HashMap<String, Queue<String>> waitingLists

//     Methods:
//         addBook(title, author):
//             create new Book object
//             add to booksList and booksMap

//         searchBook(title):
//             lookup book in booksMap
//             return book details if found

//         borrowBook(title, borrowerName):
//             if book available:
//                 mark as borrowed
//                 push book onto borrowHistory
//                 inform borrower
//             else:
//                 enqueue borrowerName to waitingLists[title]

//         returnBook(title):
//             mark book as returned
//             if waiting list not empty:
//                 dequeue next borrower
//                 inform next borrower about availability

//         listBooks():
//             iterate booksList, display details

//         borrowingHistory():
//             iterate borrowHistory, display recent borrows