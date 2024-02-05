import React from 'react'
import Navbar from '../Navbar/Navbar'
import Home from './Home'
import Login from '../pages/Login'
import { useState } from 'react'

const LandingPage = () => {
    // const [isLogin, setIsLogin] = useState(false);

    // const handleLoginClick = () => {
    //     setIsLogin(true);
    //   };
    
  return (
    <div>
      <Navbar/>
      <Home />
      {/* {isLogin ? (
        <Login />
      ) : (
        <div>
          <Home />
          <button onClick={handleLoginClick}>Login</button>
        </div>
      )} */}
    </div>
  )
}

export default LandingPage
