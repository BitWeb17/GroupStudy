import React from 'react';
import ReactDOM from 'react-dom';
import Array from './Test/Array';
import EQtest from './Test/EQtest';
import FunctionTest from './Test/FunctionTest';
import LiteralTest from './Test/LiteralTest';

ReactDOM.render(
  <React.StrictMode>
    <Array />
    <EQtest />
    <FunctionTest />
    <LiteralTest />
  </React.StrictMode>,
  document.getElementById('root')
);
