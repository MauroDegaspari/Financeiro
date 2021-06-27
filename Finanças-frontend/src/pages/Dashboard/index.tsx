import Footer from "../../components/Footer/footer";
import NavBar from "../../components/Navbar";
import DataTable from "../../components/Table/datatable";

const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary"> minha Dashboard...</h1>
                <DataTable />
            </div>

            <Footer />
        </>
    );
}

export default Dashboard;