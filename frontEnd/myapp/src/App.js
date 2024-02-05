
import './App.css';
import Login from './components/pages/Login';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import Navbar from './components/Navbar/Navbar';
import { BrowserRouter, Route, Routes } from "react-router-dom";
import LandingPage from './components/home/LandingPage';
import Register from './components/pages/Register';

function App() {
  return (
    <div>
      <BrowserRouter>
        <LandingPage />
        <Routes>
           <Route path='/login' element={<Login />}></Route>
           <Route path='/register' element={<Register />}></Route>
           {/* <Route path='/home' element={<LandingPage />}></Route> */}
        </Routes>
      </BrowserRouter>

    </div>
  );
}

export default App;
