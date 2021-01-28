import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import DataTypeBasic from "./JS_2021_01_28_Data_Type/DataTypeBasic";
import DataType from "./JS_2021_01_28_Data_Type/DataType";
import StringDataType from "./JS_2021_01_28_Data_Type/StringDataType";
import RealDataType from "./JS_2021_01_28_Data_Type/RealDataType";
import ExpDataType from "./JS_2021_01_28_Data_Type/ExpDataType"
import BoolDataType from "./JS_2021_01_28_Data_Type/BoolDataType"

ReactDOM.render(
  <React.StrictMode>
    <DataTypeBasic/>
    <DataType/>
    <StringDataType/>
    <RealDataType/>
    <ExpDataType/>
    <BoolDataType/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

