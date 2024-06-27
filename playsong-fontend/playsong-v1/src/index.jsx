import React from "react";
function Renderbody() {
    return (
        <div class="container">
        <aside class="sidebar">
            <div class="logo">
                <button class="menu-btn" id="menu-close">
                    <i class='bx bx-log-out-circle'></i>
                </button>
                <i class='bx bx-pulse'></i>
                <a href="#">AsmrProg</a>
            </div>

            <div class="menu">
                <h5>Menu</h5>
                <ul>
                    <li>
                        <i class='bx bxs-bolt-circle'></i>
                        <a href="#">Explore</a>
                    </li>
                    <li>
                        <i class='bx bxs-volume-full'></i>
                        <a href="#">Genres</a>
                    </li>
                    <li>
                        <i class='bx bxs-album'></i>
                        <a href="#">Albums</a>
                    </li>
                    <li>
                        <i class='bx bxs-microphone'></i>
                        <a href="#">Artists</a>
                    </li>
                    <li>
                        <i class='bx bxs-radio'></i>
                        <a href="#">Poddcasts</a>
                    </li>
                </ul>
            </div>

            <div class="menu">
                <h5>Library</h5>
                <ul>
                    <li>
                        <i class='bx bx-undo'></i>
                        <a href="#">Recent</a>
                    </li>
                    <li>
                        <i class='bx bxs-photo-album'></i>
                        <a href="#">Albums</a>
                    </li>
                    <li>
                        <i class='bx bxs-heart'></i>
                        <a href="#">Favourites</a>
                    </li>
                    <li>
                        <i class='bx bxs-folder'></i>
                        <a href="#">Local</a>
                    </li>

                </ul>
            </div>

            <div class="menu">
                <h5>Playlist</h5>
                <ul>
                    <li>
                        <i class='bx bxs-plus-square'></i>
                        <a href="#">Create New</a>
                    </li>
                    <li>
                        <i class='bx bxs-caret-right-circle'></i>
                        <a href="#">Best of 2023</a>
                    </li>
                    <li>
                        <i class='bx bxs-caret-right-circle'></i>
                        <a href="#">Best of 2022</a>
                    </li>
                    <li>
                        <i class='bx bxs-caret-right-circle'></i>
                        <a href="#">Kael Fischer</a>
                    </li>

                </ul>
            </div>

            <div class="playing">
                <div class="top">
                    
                    <h4>Apple Homepod</h4>
                </div>
                <div class="bottom">
                    <i class='bx bx-podcast'></i>
                    <p>Playing On Device</p>
                </div>
            </div>


        </aside>

        <main>
            <header>
                <div class="nav-links">
                    <button class="menu-btn" id="menu-open">
                        <i class='bx bx-menu'></i>
                    </button>
                    <a href="#">Music</a>
                    <a href="#">Live</a>
                    <a href="#">Podcast</a>
                </div>

                <div class="search">
                    <i class='bx bx-search'></i>
                    
                </div>

            </header>

            <div class="trending">
                <div class="left">
                    <h5>Trending New Song</h5>
                    <div class="info">
                        <h2>Lost Emotions</h2>
                        <h4>Rion Clarke</h4>
                        <h5>63 Million Plays</h5>
                        <div class="buttons">
                            <button>Listen Now</button>
                            <i class='bx bxs-heart'></i>
                        </div>
                    </div>
                </div>
               
            </div>

            <div class="playlist">
                <div class="genres">
                    <div class="header">
                        <h5>Genres</h5>
                        <a href="#">See all</a>
                    </div>

                    <div class="items">
                        <div class="item">
                            <p>ElectroPop</p>
                        </div>
                        <div class="item">
                            <p>Dance Beeat</p>
                        </div>
                        <div class="item">
                            <p>Clubhouse Remix</p>
                        </div>
                        <div class="item">
                            <p>Hip Hop Rap</p>
                        </div>
                        <div class="item">
                            <p>Alternative Indie</p>
                        </div>
                        <div class="item">
                            <p>Classical period</p>
                        </div>
                    </div>

                </div>

                <div class="music-list">
                    <div class="header">
                        <h5>Top Songs</h5>
                        <a href="#">See all</a>
                    </div>

                    <div class="items">
                        <div class="item">
                            <div class="info">
                                <p>01</p>
                                
                                <div class="details">
                                    <h5>Sunrise</h5>
                                    <p>Lila Rivera</p>
                                </div>
                            </div>
                            <div class="actions">
                                <p>03:45</p>
                                <div class="icon">
                                    <i class='bx bxs-right-arrow'></i>
                                </div>
                                <i class='bx bxs-plus-square'></i>
                            </div>
                        </div>
                        <div class="item">
                            <div class="info">
                                <p>02</p>
                            
                                <div class="details">
                                    <h5>Voyage</h5>
                                    <p>Tyde Brennnan</p>
                                </div>
                            </div>
                            <div class="actions">
                                <p>04:35</p>
                                <div class="icon">
                                    <i class='bx bxs-right-arrow'></i>
                                </div>
                                <i class='bx bxs-plus-square'></i>
                            </div>
                        </div>
                        <div class="item">
                            <div class="info">
                                <p>03</p>
                                
                                <div class="details">
                                    <h5>Breeze</h5>
                                    <p>Sola Kim</p>
                                </div>
                            </div>
                            <div class="actions">
                                <p>04:22</p>
                                <div class="icon">
                                    <i class='bx bxs-right-arrow'></i>
                                </div>
                                <i class='bx bxs-plus-square'></i>
                            </div>
                        </div>
                        <div class="item">
                            <div class="info">
                                <p>04</p>
                               
                                <div class="details">
                                    <h5>Twilight</h5>
                                    <p>Jett Lawsonn</p>
                                </div>
                            </div>
                            <div class="actions">
                                <p>03:17</p>
                                <div class="icon">
                                    <i class='bx bxs-right-arrow'></i>
                                </div>
                                <i class='bx bxs-plus-square'></i>
                            </div>
                        </div>
                    </div>

                </div>

            </div>


        </main>

        <div class="right-section">

            <div class="profile">
                <i class='bx bxs-bell'></i>
                <i class='bx bxs-cog'></i>
                <div class="user">
                    <div class="left">
                        
                    </div>
                    <div class="right">
                        <h5>Jhon Doe</h5>
                    </div>
                </div>
            </div>

            <div class="music-player">
                <div class="top-section">
                    <div class="header">
                        <h5>Player</h5>
                        <i class='bx bxs-playlist'></i>
                    </div>
                    <div class="song-info">
                            
                        <div class="description">
                            <h3>Ripple Echoes</h3>
                            <h5>Kael Fischer</h5>
                            <p>Best of 2024</p>
                        </div>
                        <div class="progress">
                            <p>02:45</p>
                            <div class="active-line"></div>
                            <div class="deactive-line"></div>
                            <p>01:02</p>
                        </div>
                    </div>
                </div>

                <div class="player-actions">
                    <div class="buttons">
                        <i class='bx bx-repeat'></i>
                        <i class='bx bx-first-page'></i>
                        <i class='bx bxs-right-arrow play-button'></i>
                        <i class='bx bx-last-page'></i>
                        <i class='bx bx-transfer-alt'></i>
                    </div>
                    <div class="lyrics">
                        <i class='bx bx-chevron-up'></i>
                        <h5>LYRICS</h5>
                    </div>
                </div>

            </div>

        </div>

    </div>
    );
  }
  
  export default Renderbody;