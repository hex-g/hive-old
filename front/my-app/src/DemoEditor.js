import React, { Component } from 'react';
import Editor from 'draft-js-plugins-editor';
import createMarkdownShortcutsPlugin from 'draft-js-markdown-shortcuts-plugin';
import { EditorState } from 'draft-js';

const plugins = [
    createMarkdownShortcutsPlugin()
];
const styles = {
    editor: {
      border: '10px solid gray',
      background: '#8a2be2'
    }
  };
export default class DemoEditor extends Component {
    state = {
        editorState: EditorState.createEmpty(),
    };
    onChange = (editorState) => {
        this.setState({
            editorState,
        });
    };
    render() {
        return (
            <React.Fragment>
                <p>clica aqui em baixo</p>
                <p>Este é um protótipo Typora-Like</p>
                <div style={styles.editor}>
                <Editor
                    editorState={this.state.editorState}
                    onChange={this.onChange}
                    plugins={plugins}
                />        
                </div>
            </React.Fragment>
        );
    }
}