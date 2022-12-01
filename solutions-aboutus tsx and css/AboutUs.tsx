import "./aboutus.css"
import * as React from 'react';
import {Typography} from '@mui/material'

export default function AboutUs() {
  return (
    <body className="aboutus">
    <div>
      <Typography variant="h3" id="headings1">About Us</Typography>
      <br/>
      <Typography variant="h4" id="headings">Developers' Goal</Typography>
      <br/>
      <Typography variant="body2" id="paragraphs">The Developers' goal is to disseminate information
        about cyber threats/risks and <br/>spread awareness for the cyber security of the internet users
      </Typography>
      <br />
      <Typography variant="h4" id="headings">Websites' Purpose</Typography>
      <br/>
      <Typography variant="body2" id="paragraphs">CyberAware is at the forefront of the country's strategic and
      coordinated efforts to <br/>improve the security, resiliency, and workforce of the cyber ecosystem.
      </Typography>
      <br />
      <Typography variant="h4" id="headings">The Developers</Typography>
      <ul>
        <li>Jim Bryan Santana BSIT - 3 Student</li>
        <li>Lee Nard Allen Deja BSIT - 3 Student</li>
        <li>Brigette Anne Icong BSIT - 3 Student</li>
        <li>Joshua Orbiso BSIT - 3 Student</li>
        <li>Vince Djohnmiel Verano BSIT - 3 Student</li>
      </ul>
    </div>
    </body>
  )
}
