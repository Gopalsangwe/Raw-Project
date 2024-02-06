import React from 'react'
import bgimage3 from '../../images/bgimage3.jpg'
import Navbar from '../Navbar/Navbar'
import Banner from './Banner'
import { useState } from 'react'
import Login from '../pages/Login'
import PopularCars from './PopularCars'


const Home = () => {
    const [IsLogin, setIsLogin] = useState(false);
    return (
        <div >
         <Banner/>
         <PopularCars/>
        </div>
    )
}

export default Home
