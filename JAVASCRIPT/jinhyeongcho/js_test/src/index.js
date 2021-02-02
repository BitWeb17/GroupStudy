import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import Work1 from "./homeWorks/02-01/Work1";
import Work2 from "./homeWorks/02-01/Work2";
import Work3 from "./homeWorks/02-01/Work3";


ReactDOM.render(
  <React.StrictMode>
    <Work1/>
    <Work2/>
    <Work3/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
