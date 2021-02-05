import React from 'react';
import ReactDOM from 'react-dom';
import ClassObj2 from './Test/ ClassObj2';
import Array from './Test/Array';
import ClassObj from './Test/ClassObj';
import Extends from './Test/Extends';
import GetterSetter from './Test/GetterSetter';
import ObjectTest from './Test/ObjectTest';
import SortTest from './Test/SortTest';

ReactDOM.render(
  <React.StrictMode>
    <ObjectTest />
    <GetterSetter />
    <ClassObj />
    <ClassObj2 />
    <Extends />
    <Array />
    <SortTest />
  </React.StrictMode>,
  document.getElementById('root')
);