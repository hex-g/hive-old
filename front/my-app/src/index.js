import React,{ Component }  from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import {Editor, EditorState} from 'draft-js';
import DemoEditor from './DemoEditor'

ReactDOM.render(
  <DemoEditor />,
  document.getElementById('root')
);
