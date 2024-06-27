import './App.css';
import axios from 'axios';
import { useState, useEffect } from 'react';
import { Routes, Route } from 'react-router-dom';
import Layout from './component/Layout';
import Home from './component/home/Home';

function App() {
  const [songs, setSongs] = useState([]);

  useEffect(() => {
    const getSongs = async () => {
      try {
        const response = await axios.get("http://localhost:8080/artist");
        console.log(response.data);
        setSongs(response.data);
      } catch (err) {
        console.error('Error fetching songs:', err);
      }
    };

    getSongs();
  }, []);

  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Home/>} />
        </Route>
      </Routes>
    </div>
  );
}

export default App;
