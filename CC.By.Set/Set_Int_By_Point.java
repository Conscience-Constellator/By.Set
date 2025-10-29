package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Int_By_Point;
import CC.Util.By.LMNt.Set_Int_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Point;
import CC.$.Q$Q.Int1$1;
import CC.$.Q$Q.Point$Int;
import CC.$.Q2$.Point_Int$;
import CC.$.Q2$1.Int2$1;

public interface Set_Int_By_Point<By_Typ,From_Typ> extends
		Get_Int_By_Point<By_Typ>,
		Set_Q_By_Point<By_Typ,From_Typ>,
		Set_Int_By_Q<From_Typ>,
		Point_Int$<By_Typ>
{
	@Lin_Dclar
	void Set_Int_By_Point(By_Typ By,int Valu);
		@Override @Neds_Ovrid(NEds=No)
		default void Point_Int$(By_Typ By,int Valu){Set_Int_By_Point(By,Valu);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Int_By_Point_Sorc(By_Typ By,Point$Int<By_Typ> Sorc){Set_Int_By_Point(By,Sorc.Point$Int(By));}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Int1$1_By_Point(By_Typ By,Int1$1 Fun,int Valu)
		{Set_Int_By_Point(By,Fun.Int1$1(Valu));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Int1$1_By_Point_Sorc(By_Typ By,Int1$1 Fun,Point$Int<By_Typ> Sorc)
			{Set_Int1$1_By_Point(By,Fun,Sorc.Point$Int(By));}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Int1$1_By_Point(By_Typ By,Int1$1 Fun)
				{Set_Int1$1_By_Point_Sorc(By,Fun,this);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Int2$1_By_Point(By_Typ By,Int2$1 Fun,int A,int B)
		{Set_Int_By_Point(By,Fun.Int2$1(A,B));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Int2$1_By_Point_SLit(By_Typ By,Int2$1 Fun,Point$Int<By_Typ> A,int B)
			{Set_Int2$1_By_Point(By,Fun,A.Point$Int(By),B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Int2$1_By_Point(By_Typ By,Int2$1 Fun,int B)
				{Set_Int2$1_By_Point_SLit(By,Fun,this,B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Set_Int2$1_By_Point_Sorc(By_Typ By,Int2$1 Fun,Point$Int<By_Typ> A,Point$Int<By_Typ> B)
				{Set_Int2$1_By_Point_SLit(By,Fun,A,B.Point$Int(By));}
					@Lin_Dclar @Neds_Ovrid(NEds=No)
					default void Mod_Int2$1_By_Point_Sorc(By_Typ By,Int2$1 Fun,Point$Int<By_Typ> B)
					{Set_Int2$1_By_Point_Sorc(By,Fun,this,B);}

	@Lin_Dclar @Neds_Ovrid(NEds=No)
	default int SGet_Int_By_Point(By_Typ By,int Valu)
	{
		int Stor=Get_Int_By_Point(By);
		Set_Int_By_Point(By,Valu);

		return Stor;
	}
}