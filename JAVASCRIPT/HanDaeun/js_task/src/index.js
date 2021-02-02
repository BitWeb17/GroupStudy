import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import Task1Print from './210128/Task1Print';
import Task2PrintEven from './210128/Task2PrintEven';
import Task3RandNum from './210128/Task3RandNum';
import Task4RandNoDup from './210128/Task4RandNoDup';
import Study1RandNumSort from './210128/Study1RandNumSort';

import Task1Sequence from './210201/Task1Sequence';
import Task2PrintMultiple from './210201/Task2PrintMultiple';
import Task3SortedMultiple from './210201/Task3SortedMultiple';

ReactDOM.render(
  <React.StrictMode>
    <Task1Print/>
    <Task2PrintEven/>
    <Task3RandNum/>
    <Task4RandNoDup/>
    <Study1RandNumSort/>

    <Task1Sequence/>
    <Task2PrintMultiple/>
    <Task3SortedMultiple/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();