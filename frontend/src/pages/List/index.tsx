import DataTable from "components/DataTable";
import { Footer } from "components/Footer";
import { NavBar } from "components/NavBar";

const List = () => {
  return (
    <>
      <NavBar />
      <div className="container">
        <div className="jumbotron">
          <h1 className="display-4">Lista de participantes</h1>
          <DataTable />
        </div>
      </div>
      <Footer />
    </>
  );
};

export default List;
