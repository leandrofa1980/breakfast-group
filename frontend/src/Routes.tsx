import Home from 'pages/Home';
import List from 'pages/List';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

const Routes = () => {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/" exact>
          <Home />
        </Route>
        <Route path="/list">
          <List />
        </Route>
      </Switch>
    </BrowserRouter>
  );
};

export default Routes;
