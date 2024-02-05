import React from 'react'
import bgimage3 from '../../images/bgimage3.jpg'

const Home = () => {
    return (
        <div style={{ height: '70vh', overflow: 'hidden' }}>
            <img src={bgimage3} alt="BackGroundImage" style={{ width: '100%', height: '100%', objectFit: 'cover' }} />

        </div>
    )
}

export default Home
