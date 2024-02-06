import React from 'react'
import bgimage5 from '../../images/bgimage5.jpg'

const Banner = () => {
  return (
    <div style={{ height: '70vh', overflow: 'hidden' }}>
            <img src={bgimage5} alt="BackGroundImage" style={{ width: '100%', height: '100%', objectFit: 'cover' }} />

        </div>
  )
}

export default Banner
