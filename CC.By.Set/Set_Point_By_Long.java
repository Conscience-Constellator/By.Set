package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Point_By_Long;
import CC.Util.By.LMNt.Set_Point_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Long;
import CC.$.Q$Q.Long$Point;
import CC.$.Q$Q.Point1$1;
import CC.$.Q2$.Long_Point$;
import CC.$.Q_Q$Q.Point2$1;

public interface Set_Point_By_Long<Valu_Typ,From_Typ> extends
	Get_Point_By_Long<Valu_Typ>,
	Set_Q_By_Long<From_Typ>,
	Set_Point_By_Q<Valu_Typ,From_Typ>,
	Long_Point$<Valu_Typ>
{
	@Lin_Dclar void Set_Point_By_Long(long By,Valu_Typ Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Long_Point$(long By,Valu_Typ Valu){Set_Point_By_Long(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point_By_Long_Sorc(long By,Long$Point<Valu_Typ> Sorc){Set_Point_By_Long(By,Sorc.Long$Point(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point1$1_By_Long(long By,Point1$1<Valu_Typ,Valu_Typ> Fun,Valu_Typ Valu)
		{Set_Point_By_Long(By,Fun.Point1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point1$1_By_Long_Sorc(long By,Point1$1<Valu_Typ,Valu_Typ> Fun,Long$Point<Valu_Typ> Sorc)
			{Set_Point1$1_By_Long(By,Fun,Sorc.Long$Point(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point1$1_By_Long(long By,Point1$1<Valu_Typ,Valu_Typ> Fun)
				{Set_Point1$1_By_Long_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point2$1_By_Long(long By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ A,Valu_Typ B)
		{Set_Point_By_Long(By,Fun.Point2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point2$1_By_Long_SLit(long By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Long$Point<Valu_Typ> A,Valu_Typ B)
			{Set_Point2$1_By_Long(By,Fun,A.Long$Point(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point2$1_By_Long(long By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ B)
				{Set_Point2$1_By_Long_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Point2$1_By_Long_Sorc(long By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Long$Point<Valu_Typ> A,Long$Point<Valu_Typ> B)
				{Set_Point2$1_By_Long_SLit(By,Fun,A,B.Long$Point(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Point2$1_By_Long_Sorc(long By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Long$Point<Valu_Typ> B)
					{Set_Point2$1_By_Long_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default Valu_Typ SGet_Point_By_Long(long By,Valu_Typ Valu)
	{
		Valu_Typ Stor=Get_Point_By_Long(By);
		Set_Point_By_Long(By,Valu);

		return Stor;
	}
}