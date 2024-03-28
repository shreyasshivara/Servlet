<html>
<head>
<title></title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="./ipl.js"></script>
</head>
<body class="bg-light">


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



            </ul>
        </div>
    </div>
</nav>

<form action="ipl" method="post" name="IPL">




    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-primary">
            <div class="card-body">
                <h6 class="card-title mb-3 text-white fs-1"></h6>

               <div class="row">
                                  <div class="col-sm-12">
                                      <div class="form-group">
                                          <div class="input-group mb-4 mt-5">
                                              <label class="input-group-text" for="team1">Team1 Name</label>
                                              <select class="form-select" id="team1" name="team1" onblur="setTeam1()">
                                                  <option selected value="0">Choose...</option>
                                                  <option value="CSK">CSK</option>
                                                  <option value="DC">DC</option>
                                                  <option value="KKR  ">KKR </option>
                                                  <option value="MI">MI</option>
                                                  <option value="KXIP">KXIP</option>
                                                  <option value="RR">RR</option>
                                                  <option value="RCB">RCB</option>

                                              </select>

                                              <span id="team1Error"></span>
                                          </div>
                                      </div>
                                  </div>
                              </div>

 <div class="row">
                                  <div class="col-sm-12">
                                      <div class="form-group">
                                          <div class="input-group mb-4 mt-5">
                                              <label class="input-group-text" for="team2">Team2 Name</label>
                                              <select class="form-select" id="team2" name="team2" onblur="setTeam2()">
                                                  <option selected value="0">Choose...</option>
                                                  <option value="CSK">CSK</option>
                                                  <option value="DC">DC</option>
                                                  <option value="KKR  ">KKR </option>
                                                  <option value="MI">MI</option>
                                                  <option value="KXIP">KXIP</option>
                                                  <option value="RR">RR</option>
                                                  <option value="RCB">RCB</option>

                                              </select>

                                              <span id="team2Error"></span>
                                          </div>
                                      </div>
                                  </div>
                              </div>

        <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="pincode" class="form-label text-white">Venue</label>
                                <input type="text" class="form-control" name="venue" id="venue" aria-describedby="modelHelp" onblur="setVenue()" >
                                <span id="venueError"></span>
                            </div>
                        </div>
                    </div>
                </div>


        <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="pincode" class="form-label text-white">Date</label>
                                <input type="date" class="form-control" name="date" id="date" aria-describedby="modelHelp" onblur="setDate()" >
                                <span id="dateError"></span>
                            </div>
                        </div>
                    </div>
                </div>

        <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="pincode" class="form-label text-white">Time</label>
                                <input type="text" class="form-control" name="time" id="time" aria-describedby="modelHelp" onblur="setTime()" >
                                <span id="timeError"></span>
                            </div>
                        </div>
                    </div>
                </div>

        <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="toss" class="form-label text-white">Toss Winner</label>
                                <input type="text" class="form-control" name="toss" id="toss" aria-describedby="modelHelp" onblur="setToss()" >
                                <span id="tossError"></span>
                            </div>
                        </div>
                    </div>
                </div>

        <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="decision" class="form-label text-white">Toss Decision</label>
                                <input type="text" class="form-control" name="decision" id="decision" aria-describedby="modelHelp" onblur="setDecision()" >
                                <span id="decisionError"></span>
                            </div>
                        </div>
                    </div>
                </div>

        <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="innings1" class="form-label text-white">Innings 1 Score</label>
                                <input type="text" class="form-control" name="innings1" id="innings1" aria-describedby="modelHelp" onblur="setInnings1()" >
                                <span id="innings1Error"></span>
                            </div>
                        </div>
                    </div>
                </div>


  <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="innings2" class="form-label text-white">Innings 2 Score</label>
                                <input type="text" class="form-control" name="innings2" id="innings2" aria-describedby="modelHelp" onblur="setInnings2()" >
                                <span id="innings2Error"></span>
                            </div>
                        </div>
                    </div>
                </div>

  <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="man" class="form-label text-white">Man of the Match</label>
                                <input type="text" class="form-control" name="man" id="man" aria-describedby="modelHelp" onblur="setManOfTheMatch()" >
                                <span id="manError"></span>
                            </div>
                        </div>
                    </div>
                </div>

  <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="top" class="form-label text-white">Top Scorer</label>
                                <input type="text" class="form-control" name="top" id="top" aria-describedby="modelHelp" onblur="setTop()" >
                                <span id="topError"></span>
                            </div>
                        </div>
                    </div>
                </div>

  <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="bowler" class="form-label text-white">Wickets Taken By Bowler</label>
                                <input type="text" class="form-control" name="bowler" id="bowler" aria-describedby="modelHelp" onblur="setBowler()" >
                                <span id="bowlerError"></span>
                            </div>
                        </div>
                    </div>
                </div>

  <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="tv" class="form-label text-white">Tv Broadcosters</label>
                                <input type="text" class="form-control" name="tv" id="tv" aria-describedby="modelHelp" onblur="setTv()" >
                                <span id="tvError"></span>
                            </div>
                        </div>
                    </div>
                </div>




 <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="input-group mb-4 mt-5">
                                <label class="input-group-text" for="weather">Weather Condition</label>
                                <select class="form-select" id="weather" name="weather" onblur="setWeather()">
                                    <option selected value="0">Choose...</option>
                                    <option value="Clear">Clear</option>
                                    <option value="Dry">Dry</option>
                                    <option value="Foggy  ">Foggy </option>
                                    <option value="Partly cloudy">Partly cloudy</option>
                                    <option value="Rainy">Rainy</option>
                                     <option value="Stormy">Stormy</option>
                                      <option value="Sunny">Sunny</option>
                                       <option value="Windy">Windy</option>

                                </select>

                                <span id="weatherError"></span>
                            </div>
                        </div>
                    </div>
                </div>

<div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="six" class="form-label text-white">Total Sixes</label>
                                <input type="text" class="form-control" name="six" id="six" aria-describedby="modelHelp" onblur="setSix()" >
                                <span id="sixError"></span>
                            </div>
                        </div>
                    </div>
                </div>



   <div class="row">
                            <div class="col-sm-12">
                                 <div class="form-group">

                                   <button type="submit" disabled id="btn"  class="me-5 ms-5">Submit</button>

                                                     </div></div>

                                             </div>


                </form>
                </div></div></div>
</body>
</html>