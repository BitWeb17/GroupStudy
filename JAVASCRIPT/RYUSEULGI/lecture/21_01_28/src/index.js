import React from 'react';
import ReactDOM from 'react-dom';
import Array from './Test/Array';
import Basic from './Test/Basic';
import ConstLet from './Test/ConstLetSymbol';
import ForTest from './Test/ForTest';
import IfTest from './Test/IfTest';
import JsonType from './Test/JsonType';
import TypeOf from './Test/TypeOf';

ReactDOM.render(
  <React.StrictMode>
    <Array />
    <Basic />
    <ConstLet />
    <DataType />
    <ForTest />
    <IfTest />
    <JsonType />
    <TypeOf />
  </React.StrictMode>,
  document.getElementById('root')
);

