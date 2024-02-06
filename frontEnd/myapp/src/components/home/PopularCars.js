import React from 'react'
import bmw from '../../images/bmw.jpg'
import audi from '../../images/audi.jpg'
import '../../../node_modules/bootstrap/dist/css/bootstrap.min.css'
//import '../../../node_modules/bootstrap/dist/js/bootstrap.bundle.min.js';

const PopularCars = () => {
    return (
        <div>
            <div className="row justify-content-between">
                <div className="col-md-4">
                    <img src={bmw} className="card-img-top" alt="..." />
                    <div className="card-body">
                        <h5 className="card-title text-center">Card title</h5>
                       
                    </div>
                </div>
                <div className="col-md-4">
                    <img src={audi} className="card-img-top" alt="..." />
                    <div className="card-body">
                        <h5 className="card-title text-center">Card title</h5>
                      
                    </div>
                </div>
                <div className="col-md-4">
                    <img src={audi} className="card-img-top" alt="..." />
                    <div className="card-body">
                        <h5 className="card-title text-center">Card title</h5>
                      
                    </div>
                </div>
            </div>
        </div>
    )
}

export default PopularCars
