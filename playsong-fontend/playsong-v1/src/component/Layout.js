
import React from "react";
import { Router,Route,Routes } from "react-router-dom";

import Home from "./home/Home";

const AppRouter = () => {   
    return (
        <Router>
            <Routes>
                <Route path="/" element={<Layout />}>
                    <Route index element={<Home />} />
                    {/* Define other routes as needed */}
                </Route>
            </Routes>
        </Router>
    );
};

export default AppRouter;
