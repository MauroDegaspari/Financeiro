import {BrowserRouter, Route, Switch} from 'react-router-dom';
import Home from '../src/pages/Home'
import Dashboard from '../src/pages/Dashboard'

 const Routes = () =>  {
      return (
         <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>
                <Route path="/dashboard">
                    <Dashboard />
                </Route>
            </Switch>
          
         </BrowserRouter>
      )
  }

  export default Routes;