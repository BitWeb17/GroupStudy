import React from 'react';
import ReactDOM from 'react-dom';
import Ex1 from './Ex/Ex1';
import ApplyMath from './Test/ApplyMath';
import ArrowFunction from './Test/ArrowFunction';
import ArrySort from './Test/ArrySort';
import IdxTest from './Test/IdxTest';
import Repeat from './Test/Repeat';
import SubOrder from './Test/SubOrder';

ReactDOM.render(
  <React.StrictMode>
    <Ex1 />
    <ArrySort />
    <ApplyMath />
    <SubOrder />
    <Repeat />
    <IdxTest />
    <ArrowFunction />
  </React.StrictMode>,
  document.getElementById('root')
);