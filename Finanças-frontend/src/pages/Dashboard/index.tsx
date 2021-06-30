import { useState, useEffect } from "react";
import Footer from "../../components/Footer/footer";
import NavBar from "../../components/Navbar";
import DataTable from "../../components/Table/datatable";
import api from "../../services/api";

const Dashboard = () => {
    const [totalConnecitons, setTotalConnections] = useState(0);

    useEffect(() =>{
        api.get('/vendas').then(response => {
        const {total} = response.data
        setTotalConnections(total); 
        })
    }, []);

    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary">  Dashboard...</h1>
                <DataTable />
            </div>

            <Footer />
        </>
    );
}

export default Dashboard;