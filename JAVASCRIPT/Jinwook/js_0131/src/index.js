import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import ObjectTest from './js_object/object-test/ObjectTest';
import ObjectTest2 from './js_object/object-test/ObjectTest2';
import ClassObject from './js_object/class-test/ClassObject';
import ClassObject2 from './js_object/class-test/ClassObject2';
import ClassObject3 from './js_object/class-test/ClassObject3';
import ClassObject4 from './js_object/class-test/ClassObject4';
import ClassExtends from './js_object/class-extends-test/ClassExtends';
import ClassExtends2 from './js_object/class-extends-test/ClassExtends2';
import ArrayJoinTest from './js_object/array-test/ArrayJoinTest';
import ArrayPopTest from './js_object/array-test/ArrayPopTest';
import ArrayPushTest from './js_object/array-test/ArrayPushTest';
import ArrayShiftTest from './js_object/array-test/ArrayShiftTest';
import ArrayUnshiftTest from './js_object/array-test/ArrayUnshiftTest';
import ArraySplicetTest from './js_object/array-test/ArraySpliceTest';
import ArrayConcatTest from './js_object/array-test/ArrayConcatTest';
import ArraySlicetTest from './js_object/array-test/ArraySliceTest';
import SortTest from './js_object/sort/SortTest';
import Exercise01 from './js_object/exercise/Exercise01';
import Exercise02 from './js_object/exercise/Exercise02';

ReactDOM.render(
  <React.StrictMode>
    <ObjectTest/>
    <ObjectTest2/>
    <ClassObject/>
    <ClassObject2/>
    <ClassObject3/>
    <ClassObject4/>
    <ClassExtends/>
    <ClassExtends2/>
    <ArrayJoinTest/>
    <ArrayPopTest/>
    <ArrayPushTest/>
    <ArrayShiftTest/>
    <ArrayUnshiftTest/>
    <ArraySplicetTest/>
    <ArrayConcatTest/>
    <ArraySlicetTest/>
    <SortTest/>
    <Exercise01/>
    <Exercise02/>

  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
