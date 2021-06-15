<%-- 
    Document   : vmmcheader
    Created on : 02-Jan-2016, 13:59:50
    Author     : System Developer
--%>
<!--header start-->
<header class="header my-blue">
    <div class="sidebar-toggle-box">
        <div data-original-title="Toggle Navigation" data-placement="right" class="fa fa-bars tooltips"></div>
    </div>
    <!--logo start-->
    <a class="logo" >ZIM<span>EPMS</span></a>
    <!--logo end-->
    <div class="nav notify-row" id="top_menu">
        <!--  notification start -->
        <ul class="nav top-menu">

            <a class= "logo" style="color: red;font: bold">${facilityName}</a>
            <!-- notification dropdown end -->
        </ul>
    </div>
    <div class="top-nav ">
        <ul class="nav pull-right top-menu">
            <!--                  <li>
                                  <input type="text" class="form-control search" placeholder="Search">
                              </li>-->
            <!-- user login dropdown start-->
            <li class="dropdown">
                <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                    <img alt="" src="img/trevor.png">
                    <span class="username"><% out.write(request.getRemoteUser());%></span>
                    <b class="caret"></b>
                </a>
                <ul class="dropdown-menu extended logout">
                    <div class="log-arrow-up"></div>
                    <li><a href="#"><i class=" fa fa-suitcase"></i>Profile</a></li>
                    <li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
                    <li><a href="#"><i class="fa fa-bell-o"></i> Notification</a></li>
                    <li><a href="Logout"><i class="fa fa-key"></i> Log Out</a></li>
                </ul>
            </li>
            <!-- user login dropdown end -->
        </ul>
    </div>
</header>
<!--header end-->
