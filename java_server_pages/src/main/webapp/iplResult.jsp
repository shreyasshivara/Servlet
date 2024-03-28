<html>
<head>
<title></title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body class="bg-white">


<nav class="navbar navbar-expand-lg navbar-primary bg-primary">
    <div class="container">

        <a class="navbar-brand" href="#"></a>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div  id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active text-white fs-3 " href="./index.jsp">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link active text-white fs-3" href="./Ipl.jsp">Re-Enter Details</a>
                </li>

 <li class="nav-item">
                    <a class="nav-link active text-white fs-3" href="  "></a>
                </li>


            </ul>
        </div>
    </div>
</nav>


    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-primary">
            <div class="card-body">
                <h6 class="card-title mb-3 text-white fs-1 d-flex justify-content-center">Your Details</h6>


                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Team 1 : <%=request.getAttribute("team1")%></h3>
                        </div>
                    </div>


                    <div class="container mb-2 mt-5">
                        <div class="container">
                            <h3 class="text-white">Team 2 : <%=request.getAttribute("team2")%></h3>
                        </div>
                    </div>


=
                    <div class="container mb-5 ">
                        <div class="container">
                            <h3 class="text-white">venue :<%=request.getAttribute("venue")%></h3>
                        </div>
                    </div>



                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">date : <%=request.getAttribute("date")%></h3>
                        </div>
                    </div>



                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">time :<%=request.getAttribute("time")%></h3>
                        </div>
                    </div>

                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">toss : <%=request.getAttribute("toss")%></h3>
                        </div>
                    </div>



                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">decision : <%=request.getAttribute("decision")%></h3>
                        </div>
                    </div>




                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">innings1 : <%=request.getAttribute("innings1")%></h3>
                        </div>
                    </div>




                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">innings2 : <%=request.getAttribute("innings2")%></h3>
                        </div>
                    </div>





                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Man Of the Match : <%=request.getAttribute("man")%></h3>
                        </div>
                    </div>




                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Top Score : <%=request.getAttribute("top")%></h3>
                        </div>
                    </div>




                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Bowler : <%=request.getAttribute("bowler")%></h3>
                        </div>
                    </div>



                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Tv Broadcost : <%=request.getAttribute("tv")%></h3>
                        </div>
                    </div>


                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Weather Condition : <%=request.getAttribute("weather")%></h3>
                        </div>
                    </div>




                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Total Sixes : <%=request.getAttribute("six")%></h3>
                        </div>
                    </div>




</div></div></div>

</body>
</html>