import * as React from 'react';
import { useState }  from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Container} from '@mui/system';
import { Paper } from '@material-ui/core';
import Button from '@mui/material/Button';


export default function Student() {
    const paperStyle={padding:'50px 20px', width:600,margin:"20px auto", backgroundColor: "#D4F1F4"}
    const [email,setEmail]=useState('')
    const [name,setName]=useState('')
    const[phone,setPhone]=useState('')
    const[message,setMessage]=useState('')

   const handleClick=(e)=>{
    e.preventDefault()
    const student={email,name,phone,message}
    console.log(student)
    fetch("http://localhost:8080/student/add",{
      
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(student)

  }).then(()=>{
    console.log("Report Submitted")
  })
}


  return (
    <Container>
        <Paper elevation={3} style={paperStyle}>
    <Box component="form" sx={{ '& > :not(style)': { m: 1 },  }} noValidate autoComplete="off">
      <TextField id="standard-basic" label="Email" variant="standard"  fullWidth
      value={email}
      onChange={(e)=>setEmail(e.target.value)}/>
      <TextField id="standard-basic" label="User Name" variant="standard" fullWidth
      value={name}
      onChange={(e)=>setName(e.target.value)} />
        <TextField id="standard-basic" label="Phone" variant="standard" fullWidth
        value={phone}
        onChange={(e)=>setPhone(e.target.value)} />
        <TextField id="standard-basic" label="Your Report" variant="standard" fullWidth
        value={message}
        onChange={(e)=>setMessage(e.target.value)}/>
   
      <Button variant="contained" color="error" onClick={handleClick}>Submit</Button>
    </Box>
    </Paper>
    </Container>
  );
}
