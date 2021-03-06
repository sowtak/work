import React from 'react';
import ReactDOM from 'react-dom';
import {Provider} from "react-redux";

import store from './store';
import App from './pages/App/App';
import './bootstrap.min.css';
import {BrowserRouter} from "react-router-dom";


ReactDOM.render(
    <Provider store={store}>
        <React.StrictMode>
            <BrowserRouter>
                <App />
            </BrowserRouter>
        </React.StrictMode>,
    </Provider>,
  document.getElementById('root')
);