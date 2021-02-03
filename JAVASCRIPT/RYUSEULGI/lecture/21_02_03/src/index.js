import React from 'react';
import ReactDOM from 'react-dom';
import ForTest from './Test/ForTest';
import MapTest from './Test/MapTest';
import SetTest from './Test/SetTest';
import Prob from './Ex/Prob';

ReactDOM.render(
  <React.StrictMode>
    <Prob />
    <SetTest />
    <MapTest />
    <ForTest /> 
  </React.StrictMode>,
  document.getElementById('root')
);
