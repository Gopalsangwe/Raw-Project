import React from 'react'
import { Link } from 'react-router-dom'
import { useNavigate } from 'react-router-dom'
import LandingPage from '../home/LandingPage';


const Navbar = () => {

    const navigate=useNavigate();

    const loginpage =()=>{
        navigate('/login');
      } 
     

    return (
        <div>
            
            <nav className="navbar navbar-expand-lg navbar-light bg-light">
                <Link to='/home' class="navbar-brand">BrandName</Link>
                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>

                <div className="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul className="navbar-nav mr-auto">
                        {/* <li className="nav-item active">
                            <button type='button' className='nav-link noBorder' onClick={homepage}>Home</button>
                        </li>
                        <li className="nav-item">
                        <button type='button' className='nav-link noBorder' onClick={homepage}>Home</button>
                        </li> */}
                       
                    </ul>
                    <form className="d-flex mx-auto">
                        <input className="form-control me-2" type="search" placeholder="Location..." aria-label="Search" />
                        <button className="btn btn-outline-success" type="submit" >Search</button>
                    </form>
                    <div >
                        <button type='button' className="btn btn-light" onClick={loginpage}>Login/Register</button>
                    </div>
                </div>
            </nav>
           
        </div>
    )
}

export default Navbar
