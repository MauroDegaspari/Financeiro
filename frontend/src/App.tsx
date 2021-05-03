import Footer from "./components/Footer/footer";
import NavBar from "./components/Navbar";
import DataTable from "./components/Table/datatable";


function App() {
  return (
    <>
      <NavBar/>
      <div className="container">
      <h1 className="text-primary"> Tudo pronto para codar...</h1>
      <DataTable/>
      </div>
    
      <Footer/>
     </>
  );
}

export default App;
