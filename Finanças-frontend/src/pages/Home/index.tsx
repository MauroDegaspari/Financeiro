import { Link } from "react-router-dom"

const Home =() => {
    return (
        <div>
            <h1>HOME - teste</h1> 
            <Link to="/dashboard"> 
            Acessar Dashboard da aplicação
            </Link>
        </div>
    );
}

export default Home;