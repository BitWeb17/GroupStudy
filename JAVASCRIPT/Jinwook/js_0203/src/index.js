import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import Prob from './exercise/Prob';
import NewSetTest from './js_set/set-test/NewSetTest';
import NewSetintitTest from './js_set/set-test/NewSetintitTest';
import AddSetTest from './js_set/set-test/AddSetTest';
import SetkeyIteratorTest from './js_set/set-test/SetkeyIteratorTest';
import SetentryIteratorTest from './js_set/set-test/SetentryIteratorTest';
import NewMapTest from './js_set/map-test/NewMapTest';
import NewMapInitTest from './js_set/map-test/NewMapInitTest';
import MapSetTest from './js_set/map-test/MapSetTest';
import MapDeleteTest from './js_set/map-test/MapDeleteTest';
import MapIterationTest from './js_set/map-test/MapIterationTest';
import ForWithSetMap from './js_set/for-test/ForWithSetMap';
import IteratorTest from './js_set/iterator-test/IteratorTest';
import IteratorTest2 from './js_set/iterator-test/IteratorTest2';
import IteratorTest3 from './js_set/iterator-test/IteratorTest3';
import ForEachWithSet from './js_set/set-test/ForEachWithSet';
import ProbRefactoring from './exercise/ProbRefactoring';

ReactDOM.render(
  <React.StrictMode>
    <Prob/>
    <ProbRefactoring/>
    <NewSetTest/>
    <NewSetintitTest/>
    <AddSetTest/>
    <SetkeyIteratorTest/>
    <SetentryIteratorTest/>
    <ForEachWithSet/>

    <NewMapTest/>
    <NewMapInitTest/>
    <MapSetTest/>
    <MapDeleteTest/>
    <MapIterationTest/>

    <ForWithSetMap/>

    <IteratorTest/>
    <IteratorTest2/>
    <IteratorTest3/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
